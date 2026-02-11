
inherit dnf-bridge

PN = "bpftrace"
PE = "0"
PV = "0.22.1"
PR = "1.el10"
PACKAGES = "bpftrace"


URI_bpftrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bpftrace-0.22.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bpftrace = " \
 zlib-ng-compat \
 libgcc \
 libbpf \
 clang-libs \
 elfutils-libelf \
 libstdc++ \
 lldb \
 bcc \
 glibc \
 llvm-libs \
"
