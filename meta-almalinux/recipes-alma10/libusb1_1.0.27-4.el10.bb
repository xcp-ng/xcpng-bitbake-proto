
PN = "libusb1"
PE = "0"
PV = "1.0.27"
PR = "4.el10"
PACKAGES = "libusb1 libusb1-devel libusb1-devel-doc libusb1-tests-examples"


URI_libusb1 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libusb1-1.0.27-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libusb1 = " \
 glibc \
 systemd-libs \
"

URI_libusb1-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libusb1-devel-1.0.27-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libusb1-devel = " \
 pkgconf-pkg-config \
 libusb1 \
"

URI_libusb1-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libusb1-devel-doc-1.0.27-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libusb1-devel-doc = " \
 libusb1-devel \
"

URI_libusb1-tests-examples = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libusb1-tests-examples-1.0.27-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libusb1-tests-examples = " \
 libgcc \
 umockdev \
 glib2 \
 glibc \
 libusb1 \
"
