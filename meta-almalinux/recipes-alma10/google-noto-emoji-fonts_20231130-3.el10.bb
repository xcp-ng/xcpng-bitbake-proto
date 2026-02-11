
inherit dnf-bridge

PN = "google-noto-emoji-fonts"
PE = "0"
PV = "20231130"
PR = "3.el10"
PACKAGES = "google-noto-color-emoji-fonts google-noto-emoji-fonts"


URI_google-noto-color-emoji-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-noto-color-emoji-fonts-20231130-3.el10.noarch.rpm;unpack=0"
RDEPENDS:google-noto-color-emoji-fonts = " \
 fonts-filesystem \
"

URI_google-noto-emoji-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-noto-emoji-fonts-20231130-3.el10.noarch.rpm;unpack=0"
RDEPENDS:google-noto-emoji-fonts = " \
 fonts-filesystem \
"
