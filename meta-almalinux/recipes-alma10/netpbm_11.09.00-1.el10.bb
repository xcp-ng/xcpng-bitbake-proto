
PN = "netpbm"
PE = "0"
PV = "11.09.00"
PR = "1.el10"
PACKAGES = "netpbm netpbm-progs netpbm-devel netpbm-doc"


URI_netpbm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/netpbm-11.09.00-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:netpbm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( )"
RPROVIDES:netpbm = "libnetpbm.so.11()(64bit) ( ) netpbm ( =  11.09.00-1.el10) netpbm(x86-64) ( =  11.09.00-1.el10)"

URI_netpbm-progs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/netpbm-progs-11.09.00-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:netpbm-progs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) perl(strict) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) perl(warnings) ( ) libz.so.1()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/perl ( ) libxml2.so.2()(64bit) ( ) libX11.so.6()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) perl(File::Spec) ( ) perl(File::Basename) ( ) perl(Getopt::Long) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) perl(Cwd) ( ) perl(Fcntl) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) perl(File::Temp) ( ) perl(IO::Handle) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) perl(Errno) ( ) perl(File::Copy) ( ) ghostscript ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( ) libjasper.so.7()(64bit) ( ) libjbig.so.2.1()(64bit) ( ) perl(English) ( ) libnetpbm.so.11()(64bit) ( ) perl(:VERSION) ( >=  5.0.0) netpbm ( =  11.09.00-1.el10)"
RPROVIDES:netpbm-progs = "netpbm-progs ( =  11.09.00-1.el10) netpbm-progs(x86-64) ( =  11.09.00-1.el10)"

URI_netpbm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/netpbm-devel-11.09.00-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:netpbm-devel = "libnetpbm.so.11()(64bit) ( ) netpbm ( =  11.09.00-1.el10)"
RPROVIDES:netpbm-devel = "netpbm-devel ( =  11.09.00-1.el10) netpbm-devel(x86-64) ( =  11.09.00-1.el10)"

URI_netpbm-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/netpbm-doc-11.09.00-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:netpbm-doc = "netpbm-progs ( =  11.09.00-1.el10)"
RPROVIDES:netpbm-doc = "netpbm-doc ( =  11.09.00-1.el10) netpbm-doc(x86-64) ( =  11.09.00-1.el10)"
