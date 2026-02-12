
inherit dnf-bridge

PN = "google-noto-sans-cjk-fonts"
PE = "1"
PV = "2.004"
PR = "9.el10"
PACKAGES = "google-noto-sans-cjk-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/google-noto-sans-cjk-fonts-2.004-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_google-noto-sans-cjk-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-noto-sans-cjk-fonts-2.004-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_google-noto-sans-cjk-fonts}"
RDEPENDS:google-noto-sans-cjk-fonts = " \
 fonts-filesystem \
"
