
inherit dnf-bridge

PN = "oci-seccomp-bpf-hook"
PE = "0"
PV = "1.2.11"
PR = "1.el10_0"
PACKAGES = "oci-seccomp-bpf-hook oci-seccomp-bpf-hook-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/oci-seccomp-bpf-hook-1.2.11-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_oci-seccomp-bpf-hook = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/oci-seccomp-bpf-hook-1.2.11-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_oci-seccomp-bpf-hook}"
RDEPENDS:oci-seccomp-bpf-hook = " \
 glibc \
 bcc \
 libseccomp \
"

URI_oci-seccomp-bpf-hook-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/oci-seccomp-bpf-hook-tests-1.2.11-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_oci-seccomp-bpf-hook-tests}"
RDEPENDS:oci-seccomp-bpf-hook-tests = " \
 oci-seccomp-bpf-hook \
 bash \
 podman \
"
