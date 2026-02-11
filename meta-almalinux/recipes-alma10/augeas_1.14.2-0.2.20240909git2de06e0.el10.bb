
PN = "augeas"
PE = "0"
PV = "1.14.2"
PR = "0.2.20240909git2de06e0.el10"
PACKAGES = "augeas augeas-libs augeas-devel augeas-bash-completion augeas-static"


URI_augeas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/augeas-1.14.2-0.2.20240909git2de06e0.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:augeas = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libreadline.so.8()(64bit) ( ) libaugeas.so.0()(64bit) ( ) libaugeas.so.0(AUGEAS_0.1.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.10.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.14.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.16.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.21.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.24.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.8.0)(64bit) ( ) libfa.so.1()(64bit) ( ) libfa.so.1(FA_1.0.0)(64bit) ( ) libfa.so.1(FA_1.5.0)(64bit) ( ) augeas-libs ( =  1.14.2-0.2.20240909git2de06e0.el10)"
RPROVIDES:augeas = "bundled(gnulib) ( ) augeas ( =  1.14.2-0.2.20240909git2de06e0.el10) augeas(x86-64) ( =  1.14.2-0.2.20240909git2de06e0.el10)"

URI_augeas-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/augeas-libs-1.14.2-0.2.20240909git2de06e0.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:augeas-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( )"
RPROVIDES:augeas-libs = "libaugeas.so.0()(64bit) ( ) libaugeas.so.0(AUGEAS_0.1.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.10.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.14.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.16.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.21.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.24.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.8.0)(64bit) ( ) libfa.so.1()(64bit) ( ) libfa.so.1(FA_1.0.0)(64bit) ( ) libfa.so.1(FA_1.5.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.11.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.12.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.15.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.18.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.20.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.22.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.23.0)(64bit) ( ) libaugeas.so.0(AUGEAS_0.25.0)(64bit) ( ) libfa.so.1(FA_1.2.0)(64bit) ( ) libfa.so.1(FA_1.4.0)(64bit) ( ) augeas-libs ( =  1.14.2-0.2.20240909git2de06e0.el10) augeas-libs(x86-64) ( =  1.14.2-0.2.20240909git2de06e0.el10)"

URI_augeas-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/augeas-devel-1.14.2-0.2.20240909git2de06e0.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:augeas-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(libxml-2.0) ( ) pkgconfig(libselinux) ( ) libaugeas.so.0()(64bit) ( ) libfa.so.1()(64bit) ( ) augeas-libs ( =  1.14.2-0.2.20240909git2de06e0.el10)"
RPROVIDES:augeas-devel = "augeas-devel ( =  1.14.2-0.2.20240909git2de06e0.el10) augeas-devel(x86-64) ( =  1.14.2-0.2.20240909git2de06e0.el10) pkgconfig(augeas) ( =  1.14.1)"

URI_augeas-bash-completion = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/augeas-bash-completion-1.14.2-0.2.20240909git2de06e0.el10.noarch.rpm;unpack=0"
RDEPENDS:augeas-bash-completion = "bash-completion ( >=  2.0) augeas ( =  1.14.2-0.2.20240909git2de06e0.el10)"
RPROVIDES:augeas-bash-completion = "augeas-bash-completion ( =  1.14.2-0.2.20240909git2de06e0.el10)"

URI_augeas-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/augeas-static-1.14.2-0.2.20240909git2de06e0.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:augeas-static = "augeas-devel ( =  1.14.2-0.2.20240909git2de06e0.el10)"
RPROVIDES:augeas-static = "augeas-static ( =  1.14.2-0.2.20240909git2de06e0.el10) augeas-static(x86-64) ( =  1.14.2-0.2.20240909git2de06e0.el10)"
