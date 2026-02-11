
PN = "jasper"
PE = "0"
PV = "4.1.0"
PR = "5.el10"
PACKAGES = "jasper jasper-libs jasper-utils jasper-devel"


URI_jasper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jasper-4.1.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jasper = " \
 glibc \
 jasper-libs \
"

URI_jasper-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jasper-libs-4.1.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jasper-libs = " \
 glibc \
 libjpeg-turbo \
"

URI_jasper-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jasper-utils-4.1.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jasper-utils = " \
 jasper \
 jasper-libs \
 libglvnd-glx \
 libglvnd-opengl \
 mesa-libGLU \
 glibc \
 freeglut \
"

URI_jasper-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jasper-devel-4.1.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jasper-devel = " \
 jasper-libs \
 pkgconf-pkg-config \
 libjpeg-turbo-devel \
"
