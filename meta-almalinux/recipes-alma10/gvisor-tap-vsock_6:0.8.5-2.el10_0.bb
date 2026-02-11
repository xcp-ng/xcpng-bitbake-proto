
inherit dnf-bridge

PN = "gvisor-tap-vsock"
PE = "6"
PV = "0.8.5"
PR = "2.el10_0"
PACKAGES = "gvisor-tap-vsock gvisor-tap-vsock-gvforwarder"


URI_gvisor-tap-vsock = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvisor-tap-vsock-0.8.5-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvisor-tap-vsock = " \
 glibc \
 gvisor-tap-vsock-gvforwarder \
"

URI_gvisor-tap-vsock-gvforwarder = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvisor-tap-vsock-gvforwarder-0.8.5-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvisor-tap-vsock-gvforwarder = " \
 glibc \
"
