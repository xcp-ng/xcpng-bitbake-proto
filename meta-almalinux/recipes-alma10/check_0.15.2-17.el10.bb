
PN = "check"
PE = "0"
PV = "0.15.2"
PR = "17.el10"
PACKAGES = "check check-devel check-static check-checkmk"


URI_check = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/check-0.15.2-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:check = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:check = "libcheck.so.0()(64bit) ( ) check(x86-64) ( =  0.15.2-17.el10) check ( =  0.15.2-17.el10)"

URI_check-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/check-devel-0.15.2-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:check-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libcheck.so.0()(64bit) ( ) check(x86-64) ( =  0.15.2-17.el10) check-static(x86-64) ( =  0.15.2-17.el10)"
RPROVIDES:check-devel = "check-devel ( =  0.15.2-17.el10) check-devel(x86-64) ( =  0.15.2-17.el10) cmake(check) ( =  0.15.2) pkgconfig(check) ( =  0.15.2)"

URI_check-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/check-static-0.15.2-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:check-static = ""
RPROVIDES:check-static = "check-static(x86-64) ( =  0.15.2-17.el10) check-static ( =  0.15.2-17.el10)"

URI_check-checkmk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/check-checkmk-0.15.2-17.el10.noarch.rpm;unpack=0"
RDEPENDS:check-checkmk = "/usr/bin/awk ( ) check ( =  0.15.2-17.el10)"
RPROVIDES:check-checkmk = "check-checkmk ( =  0.15.2-17.el10)"
