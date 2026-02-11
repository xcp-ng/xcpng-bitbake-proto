
PN = "device-mapper-multipath"
PE = "0"
PV = "0.9.9"
PR = "6.el10_0.2"
PACKAGES = "device-mapper-multipath device-mapper-multipath-libs kpartx device-mapper-multipath-devel libdmmp libdmmp-devel"


URI_device-mapper-multipath = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/device-mapper-multipath-0.9.9-6.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper-multipath = " \
 device-mapper \
 systemd \
 device-mapper-libs \
 systemd-libs \
 userspace-rcu \
 device-mapper-multipath-libs \
 libgcc \
 readline \
 libmount \
 kpartx \
 bash \
 glibc \
"

URI_device-mapper-multipath-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/device-mapper-multipath-libs-0.9.9-6.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper-multipath-libs = " \
 device-mapper-libs \
 libaio \
 systemd-libs \
 userspace-rcu \
 libgcc \
 libmount \
 glibc \
"

URI_kpartx = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kpartx-0.9.9-6.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:kpartx = " \
 glibc \
 device-mapper-libs \
 bash \
"

URI_device-mapper-multipath-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/device-mapper-multipath-devel-0.9.9-6.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper-multipath-devel = " \
 device-mapper-multipath \
 device-mapper-multipath-libs \
"

URI_libdmmp = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdmmp-0.9.9-6.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdmmp = " \
 glibc \
 json-c \
 device-mapper-multipath \
 device-mapper-multipath-libs \
"

URI_libdmmp-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdmmp-devel-0.9.9-6.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdmmp-devel = " \
 libdmmp \
 pkgconf-pkg-config \
"
