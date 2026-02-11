
inherit dnf-bridge

PN = "flatpak-runtime-config"
PE = "0"
PV = "40"
PR = "4.el10"
PACKAGES = "flatpak-runtime-config"


URI_flatpak-runtime-config = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/flatpak-runtime-config-40-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-runtime-config = " \
 glibc \
 fonts-filesystem \
 bash \
 findutils \
"
