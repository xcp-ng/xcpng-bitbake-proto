
inherit dnf-bridge

PN = "hicolor-icon-theme"
PE = "0"
PV = "0.17"
PR = "20.el10"
PACKAGES = "hicolor-icon-theme"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hicolor-icon-theme-0.17-20.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hicolor-icon-theme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hicolor-icon-theme-0.17-20.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hicolor-icon-theme}"
RDEPENDS:hicolor-icon-theme = " \
 bash \
"
