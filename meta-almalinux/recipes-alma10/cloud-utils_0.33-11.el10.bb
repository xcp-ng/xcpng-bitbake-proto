
PN = "cloud-utils"
PE = "0"
PV = "0.33"
PR = "11.el10"
PACKAGES = "cloud-utils-growpart cloud-utils cloud-utils-cloud-localds cloud-utils-ec2metadata cloud-utils-mount-image-callback cloud-utils-resize-part-image cloud-utils-vcs-run cloud-utils-write-mime-multipart"


URI_cloud-utils-growpart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cloud-utils-growpart-0.33-11.el10.noarch.rpm;unpack=0"
RDEPENDS:cloud-utils-growpart = "/usr/bin/sh ( ) util-linux ( ) gawk ( )"
RPROVIDES:cloud-utils-growpart = "cloud-utils-growpart ( =  0.33-11.el10)"

URI_cloud-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cloud-utils-0.33-11.el10.noarch.rpm;unpack=0"
RDEPENDS:cloud-utils = "cloud-utils-cloud-localds ( ) cloud-utils-ec2metadata ( ) cloud-utils-mount-image-callback ( ) cloud-utils-resize-part-image ( ) cloud-utils-vcs-run ( ) cloud-utils-write-mime-multipart ( ) cloud-utils-growpart ( )"
RPROVIDES:cloud-utils = "cloud-utils ( =  0.33-11.el10)"

URI_cloud-utils-cloud-localds = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cloud-utils-cloud-localds-0.33-11.el10.noarch.rpm;unpack=0"
RDEPENDS:cloud-utils-cloud-localds = "/usr/bin/bash ( )"
RPROVIDES:cloud-utils-cloud-localds = "cloud-utils-cloud-localds ( =  0.33-11.el10)"

URI_cloud-utils-ec2metadata = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cloud-utils-ec2metadata-0.33-11.el10.noarch.rpm;unpack=0"
RDEPENDS:cloud-utils-ec2metadata = "/usr/bin/python3 ( )"
RPROVIDES:cloud-utils-ec2metadata = "cloud-utils-ec2metadata ( =  0.33-11.el10)"

URI_cloud-utils-mount-image-callback = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cloud-utils-mount-image-callback-0.33-11.el10.noarch.rpm;unpack=0"
RDEPENDS:cloud-utils-mount-image-callback = "/usr/bin/bash ( ) gawk ( ) util-linux ( )"
RPROVIDES:cloud-utils-mount-image-callback = "cloud-utils-mount-image-callback ( =  0.33-11.el10)"

URI_cloud-utils-resize-part-image = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cloud-utils-resize-part-image-0.33-11.el10.noarch.rpm;unpack=0"
RDEPENDS:cloud-utils-resize-part-image = "/usr/bin/sh ( ) gawk ( ) e2fsprogs ( ) tar ( ) file ( ) gzip ( )"
RPROVIDES:cloud-utils-resize-part-image = "cloud-utils-resize-part-image ( =  0.33-11.el10)"

URI_cloud-utils-vcs-run = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cloud-utils-vcs-run-0.33-11.el10.noarch.rpm;unpack=0"
RDEPENDS:cloud-utils-vcs-run = "/usr/bin/bash ( )"
RPROVIDES:cloud-utils-vcs-run = "cloud-utils-vcs-run ( =  0.33-11.el10)"

URI_cloud-utils-write-mime-multipart = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cloud-utils-write-mime-multipart-0.33-11.el10.noarch.rpm;unpack=0"
RDEPENDS:cloud-utils-write-mime-multipart = "/usr/bin/python3 ( )"
RPROVIDES:cloud-utils-write-mime-multipart = "cloud-utils-write-mime-multipart ( =  0.33-11.el10)"
