
PN = "hwloc"
PE = "0"
PV = "2.11.1"
PR = "3.el10"
PACKAGES = "hwloc hwloc-libs hwloc-devel hwloc-gui"


URI_hwloc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/hwloc-2.11.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hwloc = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libhwloc.so.15()(64bit) ( ) hwloc-libs(x86-64) ( =  2.11.1-3.el10)"
RPROVIDES:hwloc = "hwloc ( =  2.11.1-3.el10) hwloc(x86-64) ( =  2.11.1-3.el10)"

URI_hwloc-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/hwloc-libs-2.11.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hwloc-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libpciaccess.so.0()(64bit) ( ) libOpenCL.so.1()(64bit) ( ) libOpenCL.so.1(OPENCL_1.0)(64bit) ( )"
RPROVIDES:hwloc-libs = "libhwloc.so.15()(64bit) ( ) hwloc-libs(x86-64) ( =  2.11.1-3.el10) hwloc-libs ( =  2.11.1-3.el10)"

URI_hwloc-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hwloc-devel-2.11.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hwloc-devel = "/usr/bin/pkg-config ( ) libhwloc.so.15()(64bit) ( ) pkgconfig(libxml-2.0) ( ) pkgconfig(pciaccess) ( ) rdma-core-devel(x86-64) ( ) hwloc-libs(x86-64) ( =  2.11.1-3.el10)"
RPROVIDES:hwloc-devel = "hwloc-devel ( =  2.11.1-3.el10) hwloc-devel(x86-64) ( =  2.11.1-3.el10) pkgconfig(hwloc) ( =  2.11.1)"

URI_hwloc-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hwloc-gui-2.11.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hwloc-gui = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libX11.so.6()(64bit) ( ) libcairo.so.2()(64bit) ( ) libtinfo.so.6()(64bit) ( ) libhwloc.so.15()(64bit) ( ) hwloc-libs(x86-64) ( =  2.11.1-3.el10)"
RPROVIDES:hwloc-gui = "application() ( ) application(lstopo.desktop) ( ) hwloc-gui ( =  2.11.1-3.el10) hwloc-gui(x86-64) ( =  2.11.1-3.el10)"
