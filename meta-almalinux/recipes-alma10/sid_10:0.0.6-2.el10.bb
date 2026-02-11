
PN = "sid"
PE = "10"
PV = "0.0.6"
PR = "2.el10"
PACKAGES = "sid sid-base-libs sid-base-libs-devel sid-iface-libs sid-iface-libs-devel sid-internal-libs sid-internal-libs-devel sid-log-libs sid-log-libs-devel sid-mod-block-blkid sid-mod-block-dm-mpath sid-mod-dummies sid-mod-type-dm sid-mod-type-dm-lvm sid-resource-libs sid-resource-libs-devel sid-tools"


URI_sid = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid = " \
 sid-log-libs \
 systemd \
 sid-resource-libs \
 sid-tools \
 systemd-udev \
 bash \
 glibc \
 sid-base-libs \
 sid-internal-libs \
"

URI_sid-base-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-base-libs-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-base-libs = " \
 glibc \
"

URI_sid-base-libs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-base-libs-devel-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-base-libs-devel = " \
 sid-base-libs \
"

URI_sid-iface-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-iface-libs-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-iface-libs = " \
 sid-log-libs \
 libuuid \
 systemd-libs \
 glibc \
 sid-base-libs \
 sid-internal-libs \
"

URI_sid-iface-libs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-iface-libs-devel-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-iface-libs-devel = " \
 sid-iface-libs \
"

URI_sid-internal-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-internal-libs-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-internal-libs = " \
 glibc \
 libuuid \
 sid-base-libs \
"

URI_sid-internal-libs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-internal-libs-devel-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-internal-libs-devel = " \
 sid-internal-libs \
"

URI_sid-log-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-log-libs-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-log-libs = " \
 glibc \
 systemd-libs \
"

URI_sid-log-libs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-log-libs-devel-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-log-libs-devel = " \
 sid-log-libs \
"

URI_sid-mod-block-blkid = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-mod-block-blkid-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-mod-block-blkid = " \
 sid-log-libs \
 libuuid \
 systemd-libs \
 sid-resource-libs \
 libblkid \
 glibc \
 sid-base-libs \
 sid-iface-libs \
 sid-internal-libs \
"

URI_sid-mod-block-dm-mpath = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-mod-block-dm-mpath-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-mod-block-dm-mpath = " \
 sid-log-libs \
 libuuid \
 systemd-libs \
 sid-resource-libs \
 device-mapper-multipath-libs \
 glibc \
 sid-base-libs \
 sid-iface-libs \
 sid-internal-libs \
"

URI_sid-mod-dummies = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-mod-dummies-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-mod-dummies = " \
 sid-log-libs \
 libuuid \
 systemd-libs \
 sid-resource-libs \
 glibc \
 sid-base-libs \
 sid-iface-libs \
 sid-internal-libs \
"

URI_sid-mod-type-dm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-mod-type-dm-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-mod-type-dm = " \
 sid-log-libs \
 libuuid \
 systemd-libs \
 sid-resource-libs \
 glibc \
 sid-base-libs \
 sid-iface-libs \
 sid-internal-libs \
"

URI_sid-mod-type-dm-lvm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-mod-type-dm-lvm-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-mod-type-dm-lvm = " \
 sid-log-libs \
 libuuid \
 systemd-libs \
 sid-mod-type-dm \
 sid-resource-libs \
 glibc \
 sid-base-libs \
 sid-iface-libs \
 sid-internal-libs \
"

URI_sid-resource-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-resource-libs-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-resource-libs = " \
 sid-log-libs \
 libuuid \
 systemd-libs \
 glibc \
 sid-base-libs \
 sid-iface-libs \
 sid-internal-libs \
"

URI_sid-resource-libs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-resource-libs-devel-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-resource-libs-devel = " \
 sid-resource-libs \
"

URI_sid-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sid-tools-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sid-tools = " \
 sid-log-libs \
 systemd-udev \
 glibc \
 sid-base-libs \
 sid-iface-libs \
 sid-internal-libs \
"
