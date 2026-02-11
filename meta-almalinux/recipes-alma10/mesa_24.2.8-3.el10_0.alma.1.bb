
PN = "mesa"
PE = "0"
PV = "24.2.8"
PR = "3.el10_0.alma.1"
PACKAGES = "mesa-dri-drivers mesa-filesystem mesa-libEGL mesa-libEGL-devel mesa-libGL mesa-libGL-devel mesa-libgbm mesa-libgbm-devel mesa-libglapi mesa-libxatracker mesa-vulkan-drivers mesa-libOSMesa mesa-libOSMesa-devel mesa-libxatracker-devel mesa-va-drivers mesa-vdpau-drivers"


URI_mesa-dri-drivers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-dri-drivers-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-dri-drivers = "
 libxshmfence
 zlib-ng-compat
 mesa-filesystem
 libgcc
 elfutils-libelf
 libzstd
 libxcb
 libstdc++
 libX11-xcb
 mesa-libgbm
 expat
 glibc
 mesa-libglapi
 llvm-libs
 libdrm
"

URI_mesa-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-filesystem-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-filesystem = ""

URI_mesa-libEGL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libEGL-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libEGL = "
 libxshmfence
 libwayland-client
 mesa-dri-drivers
 libglvnd-egl
 libwayland-server
 libxcb
 libX11-xcb
 mesa-libgbm
 expat
 glibc
 mesa-libglapi
 libdrm
"

URI_mesa-libEGL-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libEGL-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libEGL-devel = "
 mesa-libEGL
 libglvnd-devel
"

URI_mesa-libGL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libGL-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libGL = "
 libXfixes
 libxshmfence
 mesa-dri-drivers
 libglvnd-glx
 libX11
 libxcb
 libX11-xcb
 libXxf86vm
 expat
 glibc
 mesa-libglapi
 libdrm
 libXext
"

URI_mesa-libGL-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libGL-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libGL-devel = "
 libglvnd-devel
 pkgconf-pkg-config
 mesa-libGL
 mesa-libglapi
 libdrm-devel
"

URI_mesa-libgbm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libgbm-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libgbm = "
 mesa-dri-drivers
 libwayland-server
 libxcb
 expat
 glibc
 libdrm
"

URI_mesa-libgbm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libgbm-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libgbm-devel = "
 mesa-libgbm
 pkgconf-pkg-config
"

URI_mesa-libglapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libglapi-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libglapi = "
 glibc
 mesa-dri-drivers
"

URI_mesa-libxatracker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-libxatracker-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libxatracker = "
 zlib-ng-compat
 libgcc
 libzstd
 libstdc++
 expat
 glibc
 llvm-libs
 libdrm
"

URI_mesa-vulkan-drivers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mesa-vulkan-drivers-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-vulkan-drivers = "
 libxshmfence
 zlib-ng-compat
 libwayland-client
 mesa-filesystem
 libgcc
 elfutils-libelf
 libzstd
 libxcb
 libstdc++
 libX11-xcb
 expat
 glibc
 vulkan-loader
 llvm-libs
 libdrm
"

URI_mesa-libOSMesa = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mesa-libOSMesa-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libOSMesa = "
 zlib-ng-compat
 libgcc
 libzstd
 libstdc++
 glibc
 mesa-libglapi
 llvm-libs
 libdrm
"

URI_mesa-libOSMesa-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mesa-libOSMesa-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libOSMesa-devel = "
 mesa-libOSMesa
 pkgconf-pkg-config
"

URI_mesa-libxatracker-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mesa-libxatracker-devel-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-libxatracker-devel = "
 mesa-libxatracker
 pkgconf-pkg-config
"

URI_mesa-va-drivers = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mesa-va-drivers-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-va-drivers = "
 mesa-filesystem
"

URI_mesa-vdpau-drivers = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mesa-vdpau-drivers-24.2.8-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mesa-vdpau-drivers = "
 mesa-filesystem
"
