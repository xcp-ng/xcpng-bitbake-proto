
PN = "lorax"
PE = "0"
PV = "40.5.11"
PR = "1.el10.alma.1"
PACKAGES = "lorax lorax-docs lorax-lmc-novirt lorax-lmc-virt lorax-templates-generic"


URI_lorax = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lorax = "/usr/bin/python3 ( ) findutils ( ) util-linux ( ) glibc ( ) gawk ( ) e2fsprogs ( ) xz ( ) glib2 ( ) glibc-common ( ) gzip ( ) libselinux-python3 ( ) dosfstools ( ) parted ( ) device-mapper ( ) cpio ( ) psmisc ( ) xorriso ( ) isomd5sum ( ) lorax-templates ( ) python3-mako ( ) grub2 ( ) pbzip2 ( ) python3-librepo ( ) python3-pycdio ( ) xz-lzma-compat ( ) kpartx ( ) module-init-tools ( ) erofs-utils ( ) grub2-tools ( ) pigz ( ) python(abi) ( =  3.12) dracut ( >=  030) lorax-templates-rhel ( >=  10.0-45) python3-dnf ( >=  3.2.0) python3-kickstart ( >=  3.19) squashfs-tools ( >=  4.2)"
RPROVIDES:lorax = "lorax ( =  40.5.11-1.el10.alma.1) appliance-tools-minimizer ( =  40.5.11-1.el10.alma.1) config(lorax) ( =  40.5.11-1.el10.alma.1) lorax(x86-64) ( =  40.5.11-1.el10.alma.1) python3.12dist(lorax) ( =  40.5.11) python3dist(lorax) ( =  40.5.11)"

URI_lorax-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-docs-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lorax-docs = "lorax ( =  40.5.11-1.el10.alma.1)"
RPROVIDES:lorax-docs = "lorax-docs ( =  40.5.11-1.el10.alma.1) lorax-docs(x86-64) ( =  40.5.11-1.el10.alma.1)"

URI_lorax-lmc-novirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-lmc-novirt-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lorax-lmc-novirt = "tar ( ) system-logos ( ) python3-psutil ( ) anaconda-core ( ) anaconda-install-env-deps ( ) anaconda-tui ( ) lorax ( =  40.5.11-1.el10.alma.1)"
RPROVIDES:lorax-lmc-novirt = "lorax-lmc-novirt ( =  40.5.11-1.el10.alma.1) lorax-lmc-novirt(x86-64) ( =  40.5.11-1.el10.alma.1)"

URI_lorax-lmc-virt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-lmc-virt-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lorax-lmc-virt = "qemu-kvm ( ) tar ( ) edk2-ovmf ( ) lorax ( =  40.5.11-1.el10.alma.1)"
RPROVIDES:lorax-lmc-virt = "lorax-lmc-virt ( =  40.5.11-1.el10.alma.1) lorax-lmc-virt(x86-64) ( =  40.5.11-1.el10.alma.1)"

URI_lorax-templates-generic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-templates-generic-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:lorax-templates-generic = "lorax ( =  40.5.11-1.el10.alma.1)"
RPROVIDES:lorax-templates-generic = "lorax-templates ( =  40.5.11-1.el10.alma.1) lorax-templates-generic ( =  40.5.11-1.el10.alma.1) lorax-templates-generic(x86-64) ( =  40.5.11-1.el10.alma.1)"
