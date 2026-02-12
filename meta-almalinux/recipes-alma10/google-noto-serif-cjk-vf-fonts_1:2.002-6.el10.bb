
inherit dnf-bridge

PN = "google-noto-serif-cjk-vf-fonts"
PE = "1"
PV = "2.002"
PR = "6.el10"
PACKAGES = "google-noto-serif-cjk-vf-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/google-noto-serif-cjk-vf-fonts-2.002-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_google-noto-serif-cjk-vf-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-noto-serif-cjk-vf-fonts-2.002-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_google-noto-serif-cjk-vf-fonts}"
RDEPENDS:google-noto-serif-cjk-vf-fonts = " \
 fonts-filesystem \
"
