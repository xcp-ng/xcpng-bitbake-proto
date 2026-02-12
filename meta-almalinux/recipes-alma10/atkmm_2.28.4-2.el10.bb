
inherit dnf-bridge

PN = "atkmm"
PE = "0"
PV = "2.28.4"
PR = "2.el10"
PACKAGES = "atkmm atkmm-devel atkmm-doc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/atkmm-2.28.4-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_atkmm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/atkmm-2.28.4-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_atkmm}"
RDEPENDS:atkmm = " \
 atk \
 libgcc \
 libsigc++20 \
 libstdc++ \
 glib2 \
 glibc \
 glibmm2.4 \
"

URI_atkmm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/atkmm-devel-2.28.4-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_atkmm-devel}"
RDEPENDS:atkmm-devel = " \
 atkmm \
 atk-devel \
 pkgconf-pkg-config \
 glibmm2.4-devel \
"

URI_atkmm-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/atkmm-doc-2.28.4-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_atkmm-doc}"
RDEPENDS:atkmm-doc = " \
 atkmm \
 glibmm2.4-doc \
"
