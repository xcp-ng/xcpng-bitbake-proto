
inherit dnf-bridge

PN = "flatpak-rpm-macros"
PE = "0"
PV = "40"
PR = "6.el10"
PACKAGES = "flatpak-rpm-macros"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/flatpak-rpm-macros-40-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_flatpak-rpm-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/flatpak-rpm-macros-40-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flatpak-rpm-macros}"
RDEPENDS:flatpak-rpm-macros = " \
 bash \
"
