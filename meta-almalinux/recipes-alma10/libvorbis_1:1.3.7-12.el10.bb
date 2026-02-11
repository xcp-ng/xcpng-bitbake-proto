
PN = "libvorbis"
PE = "1"
PV = "1.3.7"
PR = "12.el10"
PACKAGES = "libvorbis libvorbis-devel libvorbis-devel-docs"


URI_libvorbis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvorbis-1.3.7-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvorbis = " \
 glibc \
 libogg \
"

URI_libvorbis-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvorbis-devel-1.3.7-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvorbis-devel = " \
 libvorbis \
 libvorbis-devel \
 libogg-devel \
 pkgconf-pkg-config \
"

URI_libvorbis-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvorbis-devel-docs-1.3.7-12.el10.noarch.rpm;unpack=0"
RDEPENDS:libvorbis-devel-docs = " \
 libvorbis-devel \
"
