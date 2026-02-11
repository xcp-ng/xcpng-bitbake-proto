
PN = "criu"
PE = "0"
PV = "3.19"
PR = "9.el10"
PACKAGES = "crit criu criu-libs python3-criu criu-devel criu-ns"


URI_crit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/crit-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:crit = "
 python3
 python3-criu
"

URI_criu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/criu-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:criu = "
 libuuid
 nftables
 gnutls
 libgcc
 libnl3
 bash
 libnet
 glibc
 libselinux
 protobuf-c
"

URI_criu-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/criu-libs-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:criu-libs = "
 glibc
 protobuf-c
 criu
"

URI_python3-criu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-criu-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-criu = "
 python3
 python3-protobuf
"

URI_criu-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/criu-devel-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:criu-devel = "
 criu
 criu-libs
 protobuf-c-devel
 pkgconf-pkg-config
"

URI_criu-ns = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/criu-ns-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:criu-ns = "
 python3
 criu
"
