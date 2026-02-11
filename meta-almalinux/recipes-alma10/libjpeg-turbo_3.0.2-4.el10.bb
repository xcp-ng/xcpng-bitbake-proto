
inherit dnf-bridge

PN = "libjpeg-turbo"
PE = "0"
PV = "3.0.2"
PR = "4.el10"
PACKAGES = "libjpeg-turbo libjpeg-turbo-devel libjpeg-turbo-utils turbojpeg turbojpeg-devel"


URI_libjpeg-turbo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libjpeg-turbo-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjpeg-turbo = " \
 glibc \
"

URI_libjpeg-turbo-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libjpeg-turbo-devel-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjpeg-turbo-devel = " \
 libjpeg-turbo \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_libjpeg-turbo-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libjpeg-turbo-utils-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjpeg-turbo-utils = " \
 glibc \
 libjpeg-turbo \
"

URI_turbojpeg = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/turbojpeg-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:turbojpeg = " \
 glibc \
"

URI_turbojpeg-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/turbojpeg-devel-3.0.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:turbojpeg-devel = " \
 turbojpeg \
 pkgconf-pkg-config \
"
