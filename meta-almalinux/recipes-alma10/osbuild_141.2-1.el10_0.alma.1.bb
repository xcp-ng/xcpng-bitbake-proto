
PN = "osbuild"
PE = "0"
PV = "141.2"
PR = "1.el10_0.alma.1"
PACKAGES = "osbuild osbuild-depsolve-dnf osbuild-luks2 osbuild-lvm2 osbuild-ostree osbuild-selinux python3-osbuild osbuild-tools"


URI_osbuild = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild = "/usr/bin/python3 ( ) systemd ( ) coreutils ( ) policycoreutils ( ) util-linux ( ) glibc ( ) bash ( ) tar ( ) curl ( ) e2fsprogs ( ) skopeo ( ) qemu-img ( ) bubblewrap ( ) python3-librepo ( ) osbuild-selinux ( if  selinux-policy-targeted) python3-osbuild ( =  141.2-1.el10_0.alma.1)"
RPROVIDES:osbuild = "osbuild ( =  141.2-1.el10_0.alma.1)"

URI_osbuild-depsolve-dnf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-depsolve-dnf-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-depsolve-dnf = "/usr/bin/python3 ( ) python3-dnf ( ) osbuild ( =  141.2-1.el10_0.alma.1)"
RPROVIDES:osbuild-depsolve-dnf = "osbuild-dnf-json-api ( =  8) osbuild-depsolve-dnf ( =  141.2-1.el10_0.alma.1)"

URI_osbuild-luks2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-luks2-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-luks2 = "/usr/bin/python3 ( ) cryptsetup ( ) osbuild ( =  141.2-1.el10_0.alma.1)"
RPROVIDES:osbuild-luks2 = "osbuild-luks2 ( =  141.2-1.el10_0.alma.1)"

URI_osbuild-lvm2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-lvm2-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-lvm2 = "/usr/bin/python3 ( ) lvm2 ( ) osbuild ( =  141.2-1.el10_0.alma.1)"
RPROVIDES:osbuild-lvm2 = "osbuild-lvm2 ( =  141.2-1.el10_0.alma.1)"

URI_osbuild-ostree = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-ostree-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-ostree = "/usr/bin/python3 ( ) ostree ( ) rpm-ostree ( ) osbuild ( =  141.2-1.el10_0.alma.1)"
RPROVIDES:osbuild-ostree = "osbuild-ostree ( =  141.2-1.el10_0.alma.1)"

URI_osbuild-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-selinux-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.26) selinux-policy ( >=  40.13.26) osbuild ( =  141.2-1.el10_0.alma.1)"
RPROVIDES:osbuild-selinux = "osbuild-selinux ( =  141.2-1.el10_0.alma.1)"

URI_python3-osbuild = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-osbuild-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:python3-osbuild = "python3.12dist(jsonschema) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-osbuild = "python3-osbuild ( =  141.2-1.el10_0.alma.1) python-osbuild ( =  141.2-1.el10_0.alma.1) python3.12-osbuild ( =  141.2-1.el10_0.alma.1) python3.12dist(osbuild) ( =  141.2) python3dist(osbuild) ( =  141.2)"

URI_osbuild-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/osbuild-tools-141.2-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:osbuild-tools = "/usr/bin/python3 ( ) python3-pyyaml ( ) python3-dnf ( ) osbuild ( =  141.2-1.el10_0.alma.1)"
RPROVIDES:osbuild-tools = "osbuild-tools ( =  141.2-1.el10_0.alma.1)"
