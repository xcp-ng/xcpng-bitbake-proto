
inherit dnf-bridge

PN = "plymouth"
PE = "0"
PV = "24.004.60"
PR = "13.el10.alma.1"
PACKAGES = "plymouth plymouth-core-libs plymouth-devel plymouth-graphics-libs plymouth-plugin-fade-throbber plymouth-plugin-label plymouth-plugin-script plymouth-plugin-space-flares plymouth-plugin-two-step plymouth-scripts plymouth-system-theme plymouth-theme-fade-in plymouth-theme-script plymouth-theme-solar plymouth-theme-spinfinity plymouth-theme-spinner"


URI_plymouth = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth = " \
 glibc \
 plymouth-scripts \
 xkeyboard-config \
 plymouth-core-libs \
"

URI_plymouth-core-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-core-libs-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-core-libs = " \
 glibc \
 libxkbcommon \
 libevdev \
 systemd-libs \
"

URI_plymouth-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-devel-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-devel = " \
 plymouth \
 plymouth-core-libs \
 systemd-devel \
 plymouth-graphics-libs \
 plymouth-devel \
 pkgconf-pkg-config \
 libpng-devel \
 libevdev-devel \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 xkeyboard-config-devel \
 libxkbcommon-devel \
"

URI_plymouth-graphics-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-graphics-libs-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-graphics-libs = " \
 almalinux-logos \
 libpng \
 plymouth-core-libs \
 glibc \
 libdrm \
"

URI_plymouth-plugin-fade-throbber = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-fade-throbber-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-fade-throbber = " \
 glibc \
 plymouth-graphics-libs \
 plymouth \
 plymouth-core-libs \
"

URI_plymouth-plugin-label = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-label-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-label = " \
 freetype \
 plymouth \
 plymouth-core-libs \
 plymouth-graphics-libs \
 pango \
 cairo \
 glib2 \
 glibc \
"

URI_plymouth-plugin-script = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-script-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-script = " \
 glibc \
 plymouth-graphics-libs \
 plymouth \
 plymouth-core-libs \
"

URI_plymouth-plugin-space-flares = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-space-flares-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-space-flares = " \
 plymouth \
 plymouth-core-libs \
 plymouth-graphics-libs \
 plymouth-plugin-label \
 glibc \
"

URI_plymouth-plugin-two-step = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-two-step-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-two-step = " \
 plymouth \
 plymouth-core-libs \
 plymouth-graphics-libs \
 plymouth-plugin-label \
 glibc \
"

URI_plymouth-scripts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-scripts-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-scripts = " \
 plymouth \
 gzip \
 bash \
 dracut \
 xkeyboard-config \
 coreutils \
 cpio \
 findutils \
"

URI_plymouth-system-theme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-system-theme-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-system-theme = " \
 plymouth-theme-spinner \
"

URI_plymouth-theme-fade-in = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-fade-in-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-fade-in = " \
 plymouth-scripts \
 plymouth-plugin-fade-throbber \
 bash \
"

URI_plymouth-theme-script = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-script-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-script = " \
 plymouth-scripts \
 plymouth-plugin-script \
"

URI_plymouth-theme-solar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-solar-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-solar = " \
 plymouth-scripts \
 bash \
 plymouth-plugin-space-flares \
"

URI_plymouth-theme-spinfinity = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-spinfinity-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-spinfinity = " \
 plymouth-scripts \
 bash \
 plymouth-plugin-two-step \
"

URI_plymouth-theme-spinner = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-spinner-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-spinner = " \
 plymouth-plugin-two-step \
 plymouth-scripts \
 bash \
 redhat-text-vf-fonts \
 redhat-mono-vf-fonts \
"
