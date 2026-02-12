
inherit dnf-bridge

PN = "cairomm"
PE = "0"
PV = "1.14.5"
PR = "5.el10"
PACKAGES = "cairomm cairomm-devel cairomm-doc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/cairomm-1.14.5-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cairomm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cairomm-1.14.5-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cairomm}"
RDEPENDS:cairomm = " \
 libgcc \
 libsigc++20 \
 libstdc++ \
 cairo \
 glibc \
"

URI_cairomm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cairomm-devel-1.14.5-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cairomm-devel}"
RDEPENDS:cairomm-devel = " \
 cairomm \
 cairomm-devel \
 pkgconf-pkg-config \
 libsigc++20-devel \
 cairo-devel \
"

URI_cairomm-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cairomm-doc-1.14.5-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_cairomm-doc}"
RDEPENDS:cairomm-doc = ""
