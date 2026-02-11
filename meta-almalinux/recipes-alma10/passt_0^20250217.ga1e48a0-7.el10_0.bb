
PN = "passt"
PE = "0"
PV = "0^20250217.ga1e48a0"
PR = "7.el10_0"
PACKAGES = "passt passt-selinux"


URI_passt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/passt-0^20250217.ga1e48a0-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:passt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) passt-selinux ( if  selinux-policy-targeted)"
RPROVIDES:passt = "passt ( =  0^20250217.ga1e48a0-7.el10_0) passt(x86-64) ( =  0^20250217.ga1e48a0-7.el10_0)"

URI_passt-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/passt-selinux-0^20250217.ga1e48a0-7.el10_0.noarch.rpm;unpack=0"
RDEPENDS:passt-selinux = "/bin/sh ( ) policycoreutils ( ) passt ( ) selinux-policy ( ) passt ( =  0^20250217.ga1e48a0-7.el10_0)"
RPROVIDES:passt-selinux = "passt-selinux ( =  0^20250217.ga1e48a0-7.el10_0)"
