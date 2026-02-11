
PN = "mesa"
PE = "0"
PV = "24.2.8"
PR = "3.el10_0.alma.1"
PACKAGES = "mesa-dri-drivers mesa-filesystem mesa-libEGL mesa-libEGL-devel mesa-libGL mesa-libGL-devel mesa-libgbm mesa-libgbm-devel mesa-libglapi mesa-libxatracker mesa-vulkan-drivers mesa-libOSMesa mesa-libOSMesa-devel mesa-libxatracker-devel mesa-va-drivers mesa-vdpau-drivers"


URI_mesa-dri-drivers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-dri-drivers-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-dri-drivers = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libzstd.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libLLVM.so.19.1()(64bit) ( ) libLLVM.so.19.1(LLVM_19.1)(64bit) ( ) libxcb.so.1()(64bit) ( ) libexpat.so.1()(64bit) ( ) libdrm.so.2()(64bit) ( ) libX11-xcb.so.1()(64bit) ( ) libgbm.so.1()(64bit) ( ) libxshmfence.so.1()(64bit) ( ) libxcb-sync.so.1()(64bit) ( ) libxcb-xfixes.so.0()(64bit) ( ) libxcb-dri3.so.0()(64bit) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( ) libglapi.so.0()(64bit) ( ) libxcb-present.so.0()(64bit) ( ) libdrm_amdgpu.so.1()(64bit) ( ) libxcb-dri2.so.0()(64bit) ( ) libdrm_radeon.so.1()(64bit) ( ) mesa-libglapi(x86-64) ( =  24.2.8-3.el10_0.alma.1) mesa-filesystem(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
RPROVIDES:mesa-dri-drivers = "libgallium-24.2.8.so()(64bit) ( ) libgallium-24.2.8.so(libgallium-24.2.8.so)(64bit) ( ) libdril_dri.so()(64bit) ( ) mesa-dri-drivers(x86-64) ( =  24.2.8-3.el10_0.alma.1) mesa-dri-drivers ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-filesystem-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-filesystem = ""
RPROVIDES:mesa-filesystem = "mesa-filesystem(x86-64) ( =  24.2.8-3.el10_0.alma.1) mesa-dri-filesystem ( =  24.2.8-3.el10_0.alma.1) mesa-filesystem ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libEGL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libEGL-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libEGL = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libxcb.so.1()(64bit) ( ) libexpat.so.1()(64bit) ( ) libdrm.so.2()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libX11-xcb.so.1()(64bit) ( ) libxcb-shm.so.0()(64bit) ( ) libgbm.so.1()(64bit) ( ) libxcb-randr.so.0()(64bit) ( ) libxshmfence.so.1()(64bit) ( ) libxcb-sync.so.1()(64bit) ( ) libxcb-xfixes.so.0()(64bit) ( ) libwayland-server.so.0()(64bit) ( ) libxcb-dri3.so.0()(64bit) ( ) libglapi.so.0()(64bit) ( ) libxcb-present.so.0()(64bit) ( ) libgallium-24.2.8.so()(64bit) ( ) libgallium-24.2.8.so(libgallium-24.2.8.so)(64bit) ( ) libxcb-dri2.so.0()(64bit) ( ) mesa-libglapi(x86-64) ( =  24.2.8-3.el10_0.alma.1) mesa-libgbm(x86-64) ( =  24.2.8-3.el10_0.alma.1) libglvnd-egl(x86-64) ( >=  1:1.3.2)"
RPROVIDES:mesa-libEGL = "libEGL_mesa.so.0()(64bit) ( ) mesa-libEGL(x86-64) ( =  24.2.8-3.el10_0.alma.1) mesa-libEGL ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libEGL-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libEGL-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libEGL-devel = "mesa-khr-devel(x86-64) ( ) libglvnd-devel(x86-64) ( >=  1:1.3.2) mesa-libEGL(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
RPROVIDES:mesa-libEGL-devel = "libEGL-devel ( ) libEGL-devel(x86-64) ( ) mesa-libEGL-devel ( =  24.2.8-3.el10_0.alma.1) mesa-libEGL-devel(x86-64) ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libGL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libGL-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libGL = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libxcb.so.1()(64bit) ( ) libXfixes.so.3()(64bit) ( ) libexpat.so.1()(64bit) ( ) libdrm.so.2()(64bit) ( ) libX11-xcb.so.1()(64bit) ( ) libxcb-shm.so.0()(64bit) ( ) libxcb-randr.so.0()(64bit) ( ) libxshmfence.so.1()(64bit) ( ) libxcb-sync.so.1()(64bit) ( ) libxcb-xfixes.so.0()(64bit) ( ) libxcb-dri3.so.0()(64bit) ( ) libglapi.so.0()(64bit) ( ) libxcb-present.so.0()(64bit) ( ) libgallium-24.2.8.so()(64bit) ( ) libgallium-24.2.8.so(libgallium-24.2.8.so)(64bit) ( ) libxcb-dri2.so.0()(64bit) ( ) libxcb-glx.so.0()(64bit) ( ) libXxf86vm.so.1()(64bit) ( ) mesa-libglapi(x86-64) ( =  24.2.8-3.el10_0.alma.1) libglvnd-glx(x86-64) ( >=  1:1.3.2)"
RPROVIDES:mesa-libGL = "libGLX_mesa.so.0()(64bit) ( ) mesa-libGL(x86-64) ( =  24.2.8-3.el10_0.alma.1) mesa-libGL ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libGL-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libGL-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libGL-devel = "/usr/bin/pkg-config ( ) libglapi.so.0()(64bit) ( ) libglvnd-devel(x86-64) ( >=  1:1.3.2) mesa-libGL(x86-64) ( =  24.2.8-3.el10_0.alma.1) pkgconfig(libdrm) ( >=  2.4.121)"
RPROVIDES:mesa-libGL-devel = "libGL-devel ( ) libGL-devel(x86-64) ( ) pkgconfig(dri) ( =  24.2.8) mesa-libGL-devel ( =  24.2.8-3.el10_0.alma.1) mesa-libGL-devel(x86-64) ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libgbm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libgbm-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libgbm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libexpat.so.1()(64bit) ( ) libdrm.so.2()(64bit) ( ) libxcb-randr.so.0()(64bit) ( ) libwayland-server.so.0()(64bit) ( ) libgallium-24.2.8.so()(64bit) ( ) libgallium-24.2.8.so(libgallium-24.2.8.so)(64bit) ( ) mesa-dri-drivers(x86-64) ( if  mesa-dri-drivers(x86-64))"
RPROVIDES:mesa-libgbm = "libgbm.so.1()(64bit) ( ) libgbm ( ) libgbm(x86-64) ( ) mesa-libgbm(x86-64) ( =  24.2.8-3.el10_0.alma.1) mesa-libgbm ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libgbm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libgbm-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libgbm-devel = "/usr/bin/pkg-config ( ) libgbm.so.1()(64bit) ( ) mesa-libgbm(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
RPROVIDES:mesa-libgbm-devel = "libgbm-devel ( ) libgbm-devel(x86-64) ( ) pkgconfig(gbm) ( =  24.2.8) mesa-libgbm-devel ( =  24.2.8-3.el10_0.alma.1) mesa-libgbm-devel(x86-64) ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libglapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libglapi-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libglapi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) mesa-dri-drivers(x86-64) ( if  mesa-dri-drivers(x86-64))"
RPROVIDES:mesa-libglapi = "libglapi.so.0()(64bit) ( ) libglapi ( ) libglapi(x86-64) ( ) mesa-libglapi(x86-64) ( =  24.2.8-3.el10_0.alma.1) mesa-libglapi ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libxatracker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libxatracker-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libxatracker = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libzstd.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libLLVM.so.19.1()(64bit) ( ) libLLVM.so.19.1(LLVM_19.1)(64bit) ( ) libexpat.so.1()(64bit) ( ) libdrm.so.2()(64bit) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( )"
RPROVIDES:mesa-libxatracker = "libxatracker ( ) libxatracker(x86-64) ( ) libxatracker.so.2()(64bit) ( ) mesa-libxatracker ( =  24.2.8-3.el10_0.alma.1) mesa-libxatracker(x86-64) ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-vulkan-drivers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-vulkan-drivers-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-vulkan-drivers = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libzstd.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libLLVM.so.19.1()(64bit) ( ) libLLVM.so.19.1(LLVM_19.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) libxcb.so.1()(64bit) ( ) libexpat.so.1()(64bit) ( ) libdrm.so.2()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libX11-xcb.so.1()(64bit) ( ) libxcb-shm.so.0()(64bit) ( ) libxcb-randr.so.0()(64bit) ( ) libxshmfence.so.1()(64bit) ( ) libxcb-sync.so.1()(64bit) ( ) libxcb-xfixes.so.0()(64bit) ( ) libxcb-dri3.so.0()(64bit) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( ) libxcb-present.so.0()(64bit) ( ) libdrm_amdgpu.so.1()(64bit) ( ) vulkan(x86-64) ( ) mesa-filesystem(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
RPROVIDES:mesa-vulkan-drivers = "libVkLayer_MESA_device_select.so()(64bit) ( ) libpowervr_rogue.so()(64bit) ( ) libvulkan_broadcom.so()(64bit) ( ) libvulkan_freedreno.so()(64bit) ( ) libvulkan_intel.so()(64bit) ( ) libvulkan_intel_hasvk.so()(64bit) ( ) libvulkan_lvp.so()(64bit) ( ) libvulkan_panfrost.so()(64bit) ( ) libvulkan_powervr_mesa.so()(64bit) ( ) libvulkan_radeon.so()(64bit) ( ) mesa-vulkan-drivers ( =  24.2.8-3.el10_0.alma.1) mesa-vulkan-drivers(x86-64) ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libOSMesa = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mesa-libOSMesa-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libOSMesa = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libzstd.so.1()(64bit) ( ) libLLVM.so.19.1()(64bit) ( ) libLLVM.so.19.1(LLVM_19.1)(64bit) ( ) libdrm.so.2()(64bit) ( ) libglapi.so.0()(64bit) ( ) mesa-libglapi(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
RPROVIDES:mesa-libOSMesa = "libOSMesa.so.8()(64bit) ( ) libOSMesa ( ) libOSMesa(x86-64) ( ) mesa-libOSMesa(x86-64) ( =  24.2.8-3.el10_0.alma.1) mesa-libOSMesa ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libOSMesa-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mesa-libOSMesa-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libOSMesa-devel = "/usr/bin/pkg-config ( ) libOSMesa.so.8()(64bit) ( ) mesa-libOSMesa(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
RPROVIDES:mesa-libOSMesa-devel = "pkgconfig(osmesa) ( =  8.0.0) mesa-libOSMesa-devel ( =  24.2.8-3.el10_0.alma.1) mesa-libOSMesa-devel(x86-64) ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-libxatracker-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mesa-libxatracker-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libxatracker-devel = "/usr/bin/pkg-config ( ) libxatracker.so.2()(64bit) ( ) mesa-libxatracker(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
RPROVIDES:mesa-libxatracker-devel = "libxatracker-devel ( ) libxatracker-devel(x86-64) ( ) pkgconfig(xatracker) ( =  2.5.0) mesa-libxatracker-devel ( =  24.2.8-3.el10_0.alma.1) mesa-libxatracker-devel(x86-64) ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-va-drivers = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mesa-va-drivers-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-va-drivers = "mesa-filesystem(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
RPROVIDES:mesa-va-drivers = "mesa-va-drivers ( =  24.2.8-3.el10_0.alma.1) mesa-va-drivers(x86-64) ( =  24.2.8-3.el10_0.alma.1)"

URI_mesa-vdpau-drivers = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mesa-vdpau-drivers-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-vdpau-drivers = "mesa-filesystem(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
RPROVIDES:mesa-vdpau-drivers = "mesa-vdpau-drivers ( =  24.2.8-3.el10_0.alma.1) mesa-vdpau-drivers(x86-64) ( =  24.2.8-3.el10_0.alma.1)"
