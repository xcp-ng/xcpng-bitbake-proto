
inherit dnf-bridge

PN = "pappl"
PE = "0"
PV = "1.4.6"
PR = "5.el10"
PACKAGES = "pappl pappl-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pappl-1.4.6-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pappl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pappl-1.4.6-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pappl}"
RDEPENDS:pappl = " \
 gnutls \
 libpng \
 cups-libs \
 pam-libs \
 avahi-libs \
 glibc \
 libjpeg-turbo \
 libusb1 \
"

URI_pappl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pappl-devel-1.4.6-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pappl-devel}"
RDEPENDS:pappl-devel = " \
 gnutls-devel \
 zlib-ng-compat-devel \
 avahi-devel \
 pkgconf-pkg-config \
 libusb1-devel \
 bash \
 libpng-devel \
 pappl \
 libjpeg-turbo-devel \
"
