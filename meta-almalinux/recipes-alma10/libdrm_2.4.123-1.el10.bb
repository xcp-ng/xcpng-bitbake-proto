
PN = "libdrm"
PE = "0"
PV = "2.4.123"
PR = "1.el10"
PACKAGES = "libdrm libdrm-devel drm-utils"


URI_libdrm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdrm-2.4.123-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdrm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpciaccess.so.0()(64bit) ( )"
RPROVIDES:libdrm = "libdrm.so.2()(64bit) ( ) libdrm_amdgpu.so.1()(64bit) ( ) libdrm_radeon.so.1()(64bit) ( ) libdrm_intel.so.1()(64bit) ( ) libdrm_nouveau.so.2()(64bit) ( ) libdrm(x86-64) ( =  2.4.123-1.el10) libdrm ( =  2.4.123-1.el10)"

URI_libdrm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdrm-devel-2.4.123-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdrm-devel = "/usr/bin/pkg-config ( ) kernel-headers ( ) libdrm.so.2()(64bit) ( ) libdrm_amdgpu.so.1()(64bit) ( ) libdrm_radeon.so.1()(64bit) ( ) pkgconfig(libdrm) ( ) libdrm_intel.so.1()(64bit) ( ) libdrm_nouveau.so.2()(64bit) ( ) libdrm(x86-64) ( =  2.4.123-1.el10) pkgconfig(pciaccess) ( >=  0.10)"
RPROVIDES:libdrm-devel = "libdrm-devel ( =  2.4.123-1.el10) libdrm-devel(x86-64) ( =  2.4.123-1.el10) pkgconfig(libdrm) ( =  2.4.123) pkgconfig(libdrm_amdgpu) ( =  2.4.123) pkgconfig(libdrm_intel) ( =  2.4.123) pkgconfig(libdrm_nouveau) ( =  2.4.123) pkgconfig(libdrm_radeon) ( =  2.4.123)"

URI_drm-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/drm-utils-2.4.123-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:drm-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libdrm.so.2()(64bit) ( ) libdrm_amdgpu.so.1()(64bit) ( ) libdrm(x86-64) ( =  2.4.123-1.el10)"
RPROVIDES:drm-utils = "drm-utils ( =  2.4.123-1.el10) drm-utils(x86-64) ( =  2.4.123-1.el10)"
