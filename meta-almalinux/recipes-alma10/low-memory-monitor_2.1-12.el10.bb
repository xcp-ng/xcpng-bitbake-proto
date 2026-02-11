
PN = "low-memory-monitor"
PE = "0"
PV = "2.1"
PR = "12.el10"
PACKAGES = "low-memory-monitor low-memory-monitor-doc"


URI_low-memory-monitor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/low-memory-monitor-2.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:low-memory-monitor = " \
 glibc \
 libgcc \
 bash \
 glib2 \
"

URI_low-memory-monitor-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/low-memory-monitor-doc-2.1-12.el10.noarch.rpm;unpack=0"
RDEPENDS:low-memory-monitor-doc = " \
 low-memory-monitor \
"
