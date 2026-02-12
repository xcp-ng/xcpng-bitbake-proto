
inherit dnf-bridge

PN = "madan-fonts"
PE = "0"
PV = "2.000"
PR = "40.el10"
PACKAGES = "madan-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/madan-fonts-2.000-40.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_madan-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/madan-fonts-2.000-40.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_madan-fonts}"
RDEPENDS:madan-fonts = " \
 fonts-filesystem \
"
