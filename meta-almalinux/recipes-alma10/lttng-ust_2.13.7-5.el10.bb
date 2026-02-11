
PN = "lttng-ust"
PE = "0"
PV = "2.13.7"
PR = "5.el10"
PACKAGES = "lttng-ust lttng-ust-devel python3-lttngust"


URI_lttng-ust = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lttng-ust-2.13.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lttng-ust = "
 glibc
 numactl-libs
"

URI_lttng-ust-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lttng-ust-devel-2.13.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lttng-ust-devel = "
 python3
 userspace-rcu-devel
 pkgconf-pkg-config
 systemtap-sdt-devel
 lttng-ust
"

URI_python3-lttngust = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-lttngust-2.13.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-lttngust = "
 python3
 lttng-ust
"
