
inherit dnf-bridge

PN = "usbredir"
PE = "0"
PV = "0.13.0"
PR = "6.el10"
PACKAGES = "usbredir usbredir-devel usbredir-tools"


URI_usbredir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbredir-0.13.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbredir = " \
 glibc \
 libusb1 \
"

URI_usbredir-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbredir-devel-0.13.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbredir-devel = " \
 libusb1-devel \
 usbredir \
 usbredir-devel \
 pkgconf-pkg-config \
"

URI_usbredir-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbredir-tools-0.13.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbredir-tools = " \
 glibc \
 usbredir \
 glib2 \
 libusb1 \
"
