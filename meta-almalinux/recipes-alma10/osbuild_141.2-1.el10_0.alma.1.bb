
inherit dnf-bridge

PN = "osbuild"
PE = "0"
PV = "141.2"
PR = "1.el10_0.alma.1"
PACKAGES = "osbuild osbuild-depsolve-dnf osbuild-luks2 osbuild-lvm2 osbuild-ostree osbuild-selinux python3-osbuild osbuild-tools"


URI_osbuild = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild = " \
 python3 \
 e2fsprogs \
 systemd \
 bubblewrap \
 python3-osbuild \
 util-linux \
 tar \
 qemu-img \
 curl \
 python3-librepo \
 policycoreutils \
 skopeo \
 bash \
 osbuild-selinux \
 glibc \
 coreutils \
"

URI_osbuild-depsolve-dnf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-depsolve-dnf-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-depsolve-dnf = " \
 python3 \
 osbuild \
 python3-dnf \
"

URI_osbuild-luks2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-luks2-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-luks2 = " \
 python3 \
 osbuild \
 cryptsetup \
"

URI_osbuild-lvm2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-lvm2-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-lvm2 = " \
 python3 \
 osbuild \
 lvm2 \
"

URI_osbuild-ostree = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-ostree-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-ostree = " \
 python3 \
 osbuild \
 ostree \
 rpm-ostree \
"

URI_osbuild-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-selinux-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-selinux = " \
 osbuild \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
 selinux-policy-targeted \
"

URI_python3-osbuild = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-osbuild-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:python3-osbuild = " \
 python3 \
 python3-jsonschema \
"

URI_osbuild-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/osbuild-tools-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-tools = " \
 python3 \
 python3-pyyaml \
 osbuild \
 python3-dnf \
"
