
PN = "rdma-core"
PE = "0"
PV = "54.0"
PR = "2.el10_0"
PACKAGES = "ibacm iwpmd libibumad libibverbs libibverbs-utils librdmacm librdmacm-utils rdma-core srp_daemon infiniband-diags python3-pyverbs rdma-core-devel infiniband-diags-compat"


URI_ibacm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ibacm-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibacm = "
 systemd
 systemd-libs
 libnl3
 libibumad
 bash
 libibverbs
 glibc
"

URI_iwpmd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iwpmd-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:iwpmd = "
 systemd
 systemd-libs
 libnl3
 bash
 glibc
"

URI_libibumad = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libibumad-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libibumad = "
 glibc
"

URI_libibverbs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libibverbs-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libibverbs = "
 glibc
 libnl3
"

URI_libibverbs-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libibverbs-utils-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libibverbs-utils = "
 glibc
 libibverbs
"

URI_librdmacm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/librdmacm-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:librdmacm = "
 glibc
 libnl3
 libibverbs
"

URI_librdmacm-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/librdmacm-utils-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:librdmacm-utils = "
 glibc
 libibverbs
 librdmacm
"

URI_rdma-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rdma-core-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rdma-core = "
 systemd-libs
 libnl3
 pciutils
 bash
 glibc
"

URI_srp_daemon = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/srp_daemon-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:srp_daemon = "
 systemd
 libibumad
 bash
 libibverbs
 glibc
"

URI_infiniband-diags = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/infiniband-diags-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:infiniband-diags = "
 perl-libs
 perl-Getopt-Std
 libibumad
 bash
 glibc
 perl-interpreter
"

URI_python3-pyverbs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyverbs-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pyverbs = "
 python3
 python3-libs
 librdmacm
 libibverbs
 glibc
"

URI_rdma-core-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rdma-core-devel-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:rdma-core-devel = "
 infiniband-diags
 pkgconf-pkg-config
 librdmacm
 libibumad
 libibverbs
 rdma-core-devel
"

URI_infiniband-diags-compat = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/infiniband-diags-compat-54.0-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:infiniband-diags-compat = "
 infiniband-diags
 perl-libs
 perl-Getopt-Std
 bash
 perl-interpreter
"
