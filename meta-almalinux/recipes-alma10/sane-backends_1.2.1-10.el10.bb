
PN = "sane-backends"
PE = "0"
PV = "1.2.1"
PR = "10.el10"
PACKAGES = "sane-backends sane-backends-daemon sane-backends-devel sane-backends-doc sane-backends-drivers-cameras sane-backends-drivers-scanners sane-backends-libs"


URI_sane-backends = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends = "
 systemd
 sane-backends-libs
 libpng
 systemd-udev
 libieee1284
 libxml2
 bash
 glibc
 libjpeg-turbo
 sane-airscan
 libusb1
"

URI_sane-backends-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-daemon-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-daemon = "
 sane-backends-libs
 systemd-libs
 bash
 glibc
 sane-backends
"

URI_sane-backends-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-devel-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-devel = "
 libtiff-devel
 sane-backends-drivers-cameras
 sane-backends-drivers-scanners
 sane-backends-libs
 pkgconf-pkg-config
 libieee1284-devel
 libusb1-devel
 bash
 libjpeg-turbo-devel
 sane-backends
"

URI_sane-backends-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-doc-1.2.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:sane-backends-doc = ""

URI_sane-backends-drivers-cameras = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-drivers-cameras-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-drivers-cameras = "
 sane-backends-libs
 libgcc
 libieee1284
 libxml2
 libgphoto2
 libstdc++
 glibc
 libv4l
 libtiff
 libjpeg-turbo
 sane-backends
 libusb1
"

URI_sane-backends-drivers-scanners = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-drivers-scanners-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-drivers-scanners = "
 sane-backends-libs
 libgcc
 libieee1284
 libxml2
 libstdc++
 glibc
 libtiff
 libjpeg-turbo
 sane-backends
 libusb1
"

URI_sane-backends-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sane-backends-libs-1.2.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sane-backends-libs = "
 glibc
 libxml2
 libusb1
"
