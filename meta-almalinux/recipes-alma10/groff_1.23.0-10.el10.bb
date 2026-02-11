
PN = "groff"
PE = "0"
PV = "1.23.0"
PR = "10.el10"
PACKAGES = "groff-base groff groff-doc groff-perl groff-x11"


URI_groff-base = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/groff-base-1.23.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:groff-base = "/bin/sh ( ) /usr/sbin/update-alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( )"
RPROVIDES:groff-base = "config(groff-base) ( =  1.23.0-10.el10) groff-base ( =  1.23.0-10.el10) groff-base(x86-64) ( =  1.23.0-10.el10)"

URI_groff = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/groff-1.23.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:groff = "/bin/sh ( ) /usr/sbin/update-alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) /usr/bin/bash ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) coreutils ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) groff-base ( =  1.23.0-10.el10)"
RPROVIDES:groff = "bundled(gnulib) ( ) groff ( =  1.23.0-10.el10) groff(x86-64) ( =  1.23.0-10.el10) nroff-i18n ( =  1.23.0-10.el10)"

URI_groff-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/groff-doc-1.23.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:groff-doc = "groff ( =  1.23.0-10.el10)"
RPROVIDES:groff-doc = "groff-doc ( =  1.23.0-10.el10)"

URI_groff-perl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/groff-perl-1.23.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:groff-perl = "perl(strict) ( ) /usr/bin/perl ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(Data::Dumper) ( ) perl(utf8) ( ) perl(File::Path) ( ) perl(constant) ( ) perl(File::Basename) ( ) perl(POSIX) ( ) perl(FindBin) ( ) perl(Getopt::Long) ( ) perl(File::Copy) ( ) perl(integer) ( ) perl(feature) ( ) perl(Math::Trig) ( ) perl(File::HomeDir) ( ) perl(:VERSION) ( >=  5.6.0) groff-base ( =  1.23.0-10.el10)"
RPROVIDES:groff-perl = "groff-perl ( =  1.23.0-10.el10) groff-perl(x86-64) ( =  1.23.0-10.el10)"

URI_groff-x11 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/groff-x11-1.23.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:groff-x11 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libX11.so.6()(64bit) ( ) libXaw.so.7()(64bit) ( ) libXt.so.6()(64bit) ( ) libXmu.so.6()(64bit) ( ) groff-base ( =  1.23.0-10.el10)"
RPROVIDES:groff-x11 = "groff-gxditview ( =  1.23.0-10.el10) groff-x11 ( =  1.23.0-10.el10) groff-x11(x86-64) ( =  1.23.0-10.el10)"
