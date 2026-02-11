
inherit dnf-bridge

PN = "lvm2"
PE = "10"
PV = "2.03.28"
PR = "6.el10"
PACKAGES = "device-mapper device-mapper-event device-mapper-event-libs device-mapper-libs lvm2 lvm2-libs lvm2-dbusd lvm2-lockd device-mapper-devel device-mapper-event-devel lvm2-devel lvm2-testsuite"


URI_device-mapper = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/device-mapper-1.02.202-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper = " \
 device-mapper-libs \
 systemd \
 util-linux-core \
 bash \
 glibc \
"

URI_device-mapper-event = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/device-mapper-event-1.02.202-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper-event = " \
 device-mapper \
 device-mapper-event-libs \
 systemd \
 device-mapper-libs \
 libgcc \
 bash \
 glibc \
"

URI_device-mapper-event-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/device-mapper-event-libs-1.02.202-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper-event-libs = " \
 glibc \
 device-mapper-libs \
"

URI_device-mapper-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/device-mapper-libs-1.02.202-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper-libs = " \
 glibc \
 libselinux \
 systemd-libs \
 device-mapper \
"

URI_lvm2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lvm2-2.03.28-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lvm2 = " \
 device-mapper-event-libs \
 systemd \
 libaio \
 systemd-libs \
 lvm2-libs \
 device-mapper-persistent-data \
 kmod \
 libblkid \
 bash \
 glibc \
 libselinux \
 libnvme \
 libedit \
"

URI_lvm2-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lvm2-libs-2.03.28-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lvm2-libs = " \
 device-mapper-event \
 device-mapper-event-libs \
 device-mapper-libs \
 libaio \
 systemd-libs \
 libblkid \
 glibc \
 libselinux \
 libnvme \
"

URI_lvm2-dbusd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lvm2-dbusd-2.03.28-6.el10.noarch.rpm;unpack=0"
RDEPENDS:lvm2-dbusd = " \
 python3 \
 python3-pyudev \
 systemd \
 lvm2 \
 python3-dbus \
 bash \
 dbus \
 python3-gobject-base \
"

URI_lvm2-lockd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lvm2-lockd-2.03.28-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lvm2-lockd = " \
 systemd \
 systemd-libs \
 sanlock-lib \
 lvm2 \
 bash \
 glibc \
 libselinux \
"

URI_device-mapper-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/device-mapper-devel-1.02.202-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper-devel = " \
 device-mapper \
 device-mapper-libs \
 systemd-devel \
 pkgconf-pkg-config \
 libselinux-devel \
"

URI_device-mapper-event-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/device-mapper-event-devel-1.02.202-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper-event-devel = " \
 device-mapper-event \
 device-mapper-event-libs \
 pkgconf-pkg-config \
"

URI_lvm2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lvm2-devel-2.03.28-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lvm2-devel = " \
 lvm2 \
 lvm2-libs \
 pkgconf-pkg-config \
 device-mapper-devel \
 device-mapper-event-devel \
"

URI_lvm2-testsuite = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lvm2-testsuite-2.03.28-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lvm2-testsuite = " \
 python3 \
 libaio \
 device-mapper-libs \
 systemd-libs \
 libgcc \
 libstdc++ \
 bash \
 glibc \
 libselinux \
"
