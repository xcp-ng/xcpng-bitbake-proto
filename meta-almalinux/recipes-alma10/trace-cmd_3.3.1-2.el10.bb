
inherit dnf-bridge

PN = "trace-cmd"
PE = "0"
PV = "3.3.1"
PR = "2.el10"
PACKAGES = "trace-cmd trace-cmd-python3"


URI_trace-cmd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/trace-cmd-3.3.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:trace-cmd = " \
 audit-libs \
 libzstd \
 bash \
 glibc \
 libtraceevent \
 libtracefs \
"

URI_trace-cmd-python3 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/trace-cmd-python3-3.3.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:trace-cmd-python3 = " \
 python3 \
 glibc \
 trace-cmd \
 libtraceevent \
 libtracefs \
"
