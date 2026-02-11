
PN = "python-podman"
PE = "3"
PV = "5.3.0"
PR = "1.el10"
PACKAGES = "python3-podman python3-podman+progress_bar"


URI_python3-podman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-podman-5.3.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-podman = " \
 python3-urllib3 \
 python3-requests \
 python3 \
"

URI_python3-podman+progress_bar = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-podman+progress_bar-5.3.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-podman+progress_bar = " \
 python3 \
 python3-podman \
"
