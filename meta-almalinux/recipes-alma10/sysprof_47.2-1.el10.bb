
inherit dnf-bridge

PN = "sysprof"
PE = "0"
PV = "47.2"
PR = "1.el10"
PACKAGES = "libsysprof sysprof sysprof-agent sysprof-capture-devel sysprof-cli sysprof-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sysprof-47.2-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libsysprof = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsysprof-47.2-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsysprof}"
RDEPENDS:libsysprof = " \
 systemd-libs \
 elfutils-debuginfod-client \
 libgcc \
 json-glib \
 libstdc++ \
 polkit-libs \
 glib2 \
 glibc \
 libdex \
"

URI_sysprof = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysprof-47.2-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sysprof}"
RDEPENDS:sysprof = " \
 sysprof-cli \
 systemd-libs \
 libdex \
 elfutils-debuginfod-client \
 libgcc \
 libpanel \
 json-glib \
 pango \
 libstdc++ \
 polkit-libs \
 glib2 \
 cairo \
 graphene \
 glibc \
 gtk4 \
 hicolor-icon-theme \
 libadwaita \
"

URI_sysprof-agent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysprof-agent-47.2-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sysprof-agent}"
RDEPENDS:sysprof-agent = " \
 systemd-libs \
 elfutils-debuginfod-client \
 libgcc \
 json-glib \
 libstdc++ \
 polkit-libs \
 glib2 \
 glibc \
 libdex \
"

URI_sysprof-capture-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysprof-capture-devel-47.2-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sysprof-capture-devel}"
RDEPENDS:sysprof-capture-devel = " \
 pkgconf-pkg-config \
"

URI_sysprof-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysprof-cli-47.2-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sysprof-cli}"
RDEPENDS:sysprof-cli = " \
 systemd-libs \
 kernel-tools \
 elfutils-debuginfod-client \
 libgcc \
 json-glib \
 elfutils-libelf \
 elfutils-libs \
 libstdc++ \
 polkit-libs \
 glib2 \
 glibc \
 libsysprof \
 libdex \
"

URI_sysprof-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sysprof-devel-47.2-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sysprof-devel}"
RDEPENDS:sysprof-devel = " \
 json-glib-devel \
 sysprof-capture-devel \
 glib2-devel \
 systemd-devel \
 polkit-devel \
 pkgconf-pkg-config \
 libdex-devel \
 libsysprof \
 elfutils-debuginfod-client-devel \
"
