
PN = "libwebp"
PE = "0"
PV = "1.3.2"
PR = "8.el10"
PACKAGES = "libwebp libwebp-devel libwebp-tools"


URI_libwebp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwebp-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwebp = "
 glibc
"

URI_libwebp-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwebp-devel-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwebp-devel = "
 libwebp
 cmake-filesystem
 pkgconf-pkg-config
 libwebp-devel
"

URI_libwebp-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwebp-tools-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwebp-tools = "
 giflib
 libpng
 libglvnd-glx
 libglvnd-opengl
 libwebp
 glibc
 freeglut
 libjpeg-turbo
 libtiff
"
