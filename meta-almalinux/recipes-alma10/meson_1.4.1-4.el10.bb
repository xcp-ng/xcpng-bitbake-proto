
inherit dnf-bridge

PN = "meson"
PE = "0"
PV = "1.4.1"
PR = "4.el10"
PACKAGES = "meson"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/meson-1.4.1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_meson = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/meson-1.4.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_meson}"
RDEPENDS:meson = " \
 python3 \
 ninja-build \
 python3-setuptools \
"
