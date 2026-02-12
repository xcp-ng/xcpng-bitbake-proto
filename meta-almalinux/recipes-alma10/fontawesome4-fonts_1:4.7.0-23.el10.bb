
inherit dnf-bridge

PN = "fontawesome4-fonts"
PE = "1"
PV = "4.7.0"
PR = "23.el10"
PACKAGES = "fontawesome4-fonts fontawesome4-fonts-web"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/fontawesome4-fonts-4.7.0-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fontawesome4-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fontawesome4-fonts-4.7.0-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_fontawesome4-fonts}"
RDEPENDS:fontawesome4-fonts = " \
 fonts-filesystem \
"

URI_fontawesome4-fonts-web = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fontawesome4-fonts-web-4.7.0-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_fontawesome4-fonts-web}"
RDEPENDS:fontawesome4-fonts-web = " \
 fontawesome4-fonts \
"
