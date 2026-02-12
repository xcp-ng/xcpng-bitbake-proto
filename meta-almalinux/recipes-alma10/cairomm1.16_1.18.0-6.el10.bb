
inherit dnf-bridge

PN = "cairomm1.16"
PE = "0"
PV = "1.18.0"
PR = "6.el10"
PACKAGES = "cairomm1.16 cairomm1.16-devel cairomm1.16-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/cairomm1.16-1.18.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cairomm1.16 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairomm1.16-1.18.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cairomm1.16}"
RDEPENDS:cairomm1.16 = " \
 libgcc \
 libstdc++ \
 cairo \
 glibc \
 libsigc++30 \
"

URI_cairomm1.16-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cairomm1.16-devel-1.18.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cairomm1.16-devel}"
RDEPENDS:cairomm1.16-devel = " \
 libsigc++30-devel \
 pkgconf-pkg-config \
 cairo-devel \
 cairomm1.16 \
 cairomm1.16-devel \
"

URI_cairomm1.16-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cairomm1.16-doc-1.18.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_cairomm1.16-doc}"
RDEPENDS:cairomm1.16-doc = ""
