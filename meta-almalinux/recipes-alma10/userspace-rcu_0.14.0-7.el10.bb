
inherit dnf-bridge

PN = "userspace-rcu"
PE = "0"
PV = "0.14.0"
PR = "7.el10"
PACKAGES = "userspace-rcu userspace-rcu-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/userspace-rcu-0.14.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_userspace-rcu = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/userspace-rcu-0.14.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_userspace-rcu}"
RDEPENDS:userspace-rcu = " \
 glibc \
"

URI_userspace-rcu-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/userspace-rcu-devel-0.14.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_userspace-rcu-devel}"
RDEPENDS:userspace-rcu-devel = " \
 pkgconf-pkg-config \
 userspace-rcu \
"
