
PN = "libtheora"
PE = "1"
PV = "1.1.1"
PR = "39.el10"
PACKAGES = "libtheora theora-tools libtheora-devel libtheora-devel-docs"


URI_libtheora = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtheora-1.1.1-39.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtheora = " \
 glibc \
 libogg \
"

URI_theora-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/theora-tools-1.1.1-39.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:theora-tools = " \
 libvorbis \
 libogg \
 libpng \
 glibc \
 sdl12-compat \
 libtheora \
"

URI_libtheora-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtheora-devel-1.1.1-39.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtheora-devel = " \
 libogg-devel \
 pkgconf-pkg-config \
 libtheora \
 libtheora-devel \
"

URI_libtheora-devel-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libtheora-devel-docs-1.1.1-39.el10.noarch.rpm;unpack=0"
RDEPENDS:libtheora-devel-docs = ""
