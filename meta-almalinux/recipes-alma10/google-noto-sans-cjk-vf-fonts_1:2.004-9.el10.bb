
inherit dnf-bridge

PN = "google-noto-sans-cjk-vf-fonts"
PE = "1"
PV = "2.004"
PR = "9.el10"
PACKAGES = "google-noto-sans-cjk-vf-fonts google-noto-sans-mono-cjk-vf-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/google-noto-sans-cjk-vf-fonts-2.004-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_google-noto-sans-cjk-vf-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-noto-sans-cjk-vf-fonts-2.004-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_google-noto-sans-cjk-vf-fonts}"
RDEPENDS:google-noto-sans-cjk-vf-fonts = " \
 fonts-filesystem \
"

URI_google-noto-sans-mono-cjk-vf-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-noto-sans-mono-cjk-vf-fonts-2.004-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_google-noto-sans-mono-cjk-vf-fonts}"
RDEPENDS:google-noto-sans-mono-cjk-vf-fonts = " \
 fonts-filesystem \
"
