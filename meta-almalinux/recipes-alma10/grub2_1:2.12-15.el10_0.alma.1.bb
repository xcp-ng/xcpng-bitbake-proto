
PN = "grub2"
PE = "1"
PV = "2.12"
PR = "15.el10_0.alma.1"
PACKAGES = "grub2-common grub2-efi-aa64-modules grub2-efi-x64 grub2-efi-x64-cdboot grub2-efi-x64-modules grub2-pc grub2-pc-modules grub2-ppc64le-modules grub2-tools grub2-tools-efi grub2-tools-extra grub2-tools-minimal grub2-efi-ia32 grub2-efi-ia32-cdboot grub2-efi-ia32-modules grub2-emu grub2-emu-modules grub2-pc-modules grub2-ppc64le-modules"


URI_grub2-common = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-common-2.12-15.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:grub2-common = " \
 coreutils \
 util-linux-core \
 bash \
 grep \
"

URI_grub2-efi-aa64-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-efi-aa64-modules-2.12-15.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:grub2-efi-aa64-modules = " \
 grub2-common \
"

URI_grub2-efi-x64 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-efi-x64-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-efi-x64 = " \
 grub2-common \
 efi-filesystem \
 grub2-tools-minimal \
 grub2-tools \
"

URI_grub2-efi-x64-cdboot = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-efi-x64-cdboot-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-efi-x64-cdboot = " \
 grub2-common \
"

URI_grub2-efi-x64-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-efi-x64-modules-2.12-15.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:grub2-efi-x64-modules = " \
 grub2-common \
"

URI_grub2-pc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-pc-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-pc = " \
 grub2-tools-minimal \
 grub2-pc-modules \
 grub2-common \
 gettext-runtime \
 dracut \
 which \
 file \
 grub2-tools \
"

URI_grub2-pc-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-pc-modules-2.12-15.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:grub2-pc-modules = " \
 grub2-common \
"

URI_grub2-ppc64le-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-ppc64le-modules-2.12-15.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:grub2-ppc64le-modules = " \
 grub2-common \
"

URI_grub2-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-tools-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-tools = " \
 glibc \
 systemd \
 device-mapper-libs \
 os-prober \
 grep \
 grub2-common \
 gettext-runtime \
 bash \
 dracut \
 sed \
 file \
 xz-libs \
"

URI_grub2-tools-efi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-tools-efi-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-tools-efi = " \
 device-mapper-libs \
 os-prober \
 grub2-common \
 gettext-runtime \
 glibc \
 file \
"

URI_grub2-tools-extra = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-tools-extra-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-tools-extra = " \
 device-mapper-libs \
 freetype \
 grub2-tools-minimal \
 os-prober \
 mtools \
 grub2-common \
 gettext-runtime \
 bash \
 glibc \
 file \
 xz-libs \
"

URI_grub2-tools-minimal = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grub2-tools-minimal-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-tools-minimal = " \
 device-mapper-libs \
 fuse-libs \
 grub2-common \
 gettext-runtime \
 bash \
 glibc \
 xz-libs \
"

URI_grub2-efi-ia32 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/grub2-efi-ia32-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-efi-ia32 = " \
 grub2-common \
 efi-filesystem \
 grub2-tools-minimal \
 grub2-tools \
"

URI_grub2-efi-ia32-cdboot = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/grub2-efi-ia32-cdboot-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-efi-ia32-cdboot = " \
 grub2-common \
"

URI_grub2-efi-ia32-modules = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/grub2-efi-ia32-modules-2.12-15.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:grub2-efi-ia32-modules = " \
 grub2-common \
 bash \
"

URI_grub2-emu = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/grub2-emu-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-emu = " \
 glibc \
 grub2-tools-minimal \
 libgcc \
 device-mapper-libs \
"

URI_grub2-emu-modules = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/grub2-emu-modules-2.12-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:grub2-emu-modules = " \
 grub2-tools-minimal \
"

URI_grub2-pc-modules = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/grub2-pc-modules-2.12-15.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:grub2-pc-modules = " \
 grub2-common \
"

URI_grub2-ppc64le-modules = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/grub2-ppc64le-modules-2.12-15.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:grub2-ppc64le-modules = " \
 grub2-common \
"
