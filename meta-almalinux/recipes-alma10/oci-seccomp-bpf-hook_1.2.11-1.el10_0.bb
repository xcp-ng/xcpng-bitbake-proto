
PN = "oci-seccomp-bpf-hook"
PE = "0"
PV = "1.2.11"
PR = "1.el10_0"
PACKAGES = "oci-seccomp-bpf-hook oci-seccomp-bpf-hook-tests"


URI_oci-seccomp-bpf-hook = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/oci-seccomp-bpf-hook-1.2.11-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:oci-seccomp-bpf-hook = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libresolv.so.2()(64bit) ( ) libseccomp.so.2()(64bit) ( ) bcc ( ) libbcc.so.0()(64bit) ( )"
RPROVIDES:oci-seccomp-bpf-hook = "bundled(golang(github.com/iovisor/gobpf)) ( =  v0.2.0) bundled(golang(github.com/opencontainers/runtime_spec)) ( =  v1.0.3_0.20200728170252_4d89ac9fbff6) bundled(golang(github.com/seccomp/containers_golang)) ( =  v0.6.0) bundled(golang(github.com/seccomp/libseccomp_golang)) ( =  v0.9.1) bundled(golang(github.com/sirupsen/logrus)) ( =  v1.8.1) bundled(golang(github.com/stretchr/testify)) ( =  v1.4.0) oci-seccomp-bpf-hook ( =  1.2.11-1.el10_0) oci-seccomp-bpf-hook(x86-64) ( =  1.2.11-1.el10_0)"

URI_oci-seccomp-bpf-hook-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/oci-seccomp-bpf-hook-tests-1.2.11-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:oci-seccomp-bpf-hook-tests = "/usr/bin/bash ( ) podman ( ) oci-seccomp-bpf-hook ( =  1.2.11-1.el10_0)"
RPROVIDES:oci-seccomp-bpf-hook-tests = "oci-seccomp-bpf-hook-tests ( =  1.2.11-1.el10_0) oci-seccomp-bpf-hook-tests(x86-64) ( =  1.2.11-1.el10_0)"
