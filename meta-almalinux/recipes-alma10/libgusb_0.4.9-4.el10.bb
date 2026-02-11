
inherit dnf-bridge

PN = "libgusb"
PE = "0"
PV = "0.4.9"
PR = "4.el10"
PACKAGES = "libgusb libgusb-devel"


URI_libgusb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgusb-0.4.9-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgusb = " \
 libgcc \
 json-glib \
 glib2 \
 glibc \
 libusb1 \
"

URI_libgusb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgusb-devel-0.4.9-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgusb-devel = " \
 json-glib-devel \
 glib2-devel \
 libgcc \
 pkgconf-pkg-config \
 json-glib \
 libusb1-devel \
 libgusb \
 glib2 \
 glibc \
"
