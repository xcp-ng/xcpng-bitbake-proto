
inherit dnf-bridge

PN = "libbpf"
PE = "2"
PV = "1.5.0"
PR = "4.el10"
PACKAGES = "libbpf libbpf-devel libbpf-static"


URI_libbpf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libbpf-1.5.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbpf = " \
 glibc \
 zlib-ng-compat \
 elfutils-libelf \
"

URI_libbpf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libbpf-devel-1.5.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbpf-devel = " \
 zlib-ng-compat \
 zlib-ng-compat-devel \
 libbpf \
 pkgconf-pkg-config \
 kernel-headers \
 elfutils-libelf-devel \
"

URI_libbpf-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libbpf-static-1.5.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbpf-static = " \
 libbpf-devel \
"
