import sys
import pygame

from scripts.utils import load_image
from scripts.entity import PhysicsEntity

class Game:

    def __init__(self):
        pygame.init()   #initialize pygame
        pygame.display.set_caption("Ninja Game")
        self.screen = pygame.display.set_mode((640, 480))    # Creating a window 640x480 pixels

        # GAME LOOP
        # To fix the FPS (we are not using delta time for simplicity)
        # Instantiating a Clock object
        self.clock = pygame.time.Clock()

            # Making an image object
            # self.img = pygame.image.load("data/images/clouds/cloud_1.png")
            # self.img.set_colorkey((0,0,0))
            #
            # self.img_pos = [160, 260]
        self.movement = [False, False]
            # self.collision_area = pygame.Rect(50, 50, 300, 50)

        self.assets = {
            "player" : load_image("entities/player.png")
        }

        self.player = PhysicsEntity(self, "player", (50,50), (8, 15))

    def run(self):

        while True:
            self.screen.fill((14,219,248))

            self.player.update(((self.movement[1] - self.movement[0]) , 0))
            self.player.render(self.screen)
            # To actually put the image on screen
               # self.screen.blit(self.img, self.img_pos)
               # Surface = image (including the window)
               # Blit merges together different images

                # # img_r = pygame.Rect(self.img_pos[0], self.img_pos[1], self.img.get_width(), self.img.get_height())
                # img_r = pygame.Rect(*self.img_pos, *self.img.get_size())
                # if img_r.colliderect(self.collision_area):
                #     pygame.draw.rect(self.screen, (0, 100, 255), self.collision_area)
                # else:
                #     pygame.draw.rect(self.screen, (0, 50, 155), self.collision_area)
                #
                # self.img_pos[1] += ( self.movement[1] - self.movement[0] ) / 50
                # # To actually put the image on screen
                # self.screen.blit(self.img, self.img_pos)
                # # Surface = image (including the window)
                # # Blit merges together different images


            # We get all events from this
            for event in pygame.event.get():
            # Close the window when "X" is pressed
                if event.type == pygame.QUIT:
                    pygame.quit()
                    sys.exit()
                # If a key is pressed
                if event.type == pygame.KEYDOWN:
                    # If the up key is pressed
                    # Pressed not holding it down
                    if event.key == pygame.K_LEFT:
                        self.movement[0] = True
                    if event.key == pygame.K_RIGHT:
                        self.movement[1] = True
                if event.type == pygame.KEYUP:
                    if event.key == pygame.K_LEFT:
                        self.movement[0] = False
                    if event.key == pygame.K_RIGHT:
                        self.movement[1] = False

                pygame.display.update()
                self.clock.tick(60)  # 60 FPS (sleep)

Game().run()    # Game() returns initialised obj and .run() runs off of it
